package com.okeino2;

import com.Album;

import java.util.*;

public class Main {

    private  static ArrayList<Album> myAlbum = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here

        Album albums = new Album("Kings rock","ACE");
        albums.newSong("Rock",3.59);
        albums.newSong("Rockers rock",5.59);
        albums.newSong("Rocky nuk",3.59);
        albums.newSong("Rocks love",2.59);

         myAlbum.add(albums);

         albums = new Album("New Beats","ACE Mac");
        albums.newSong("Funk one",3.59);
        albums.newSong("Free flow",5.29);
        albums.newSong("Luv nuk",3.59);
        albums.newSong("love",7.59);

        myAlbum.add(albums);

        LinkedList<Song> playList = new LinkedList<>();
        myAlbum.get(0).addToPlayList("Rock",playList);
        myAlbum.get(0).addToPlayList("Rocks love",playList);
        myAlbum.get(0).addToPlayList("nuk",playList);// does not work
        myAlbum.get(0).addToPlayList(3,playList);

        myAlbum.get(1).addToPlayList(4,playList);
        myAlbum.get(1).addToPlayList(2,playList);
        myAlbum.get(1).addToPlayList(1,playList);
        myAlbum.get(1).addToPlayList(3,playList);
        myAlbum.get(1).addToPlayList(12,playList); // there is no track 12

        play(playList);
    }

    private static void play(LinkedList<Song> playList){

        Scanner scanner =new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.size() == 0){
            System.out.println("No songs in playList");
            return;
        }
        else{
            System.out.println("Now playing "+ listIterator.next().toString());
            printMenu();
        }

        while (!quit){

            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){

                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:

                    if( !forward){
                         if(listIterator.hasNext()){
                             listIterator.next();
                         }
                         forward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing "+ listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:

                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();

                        }
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:

                      if(forward){
                          if(listIterator.hasPrevious()){
                              System.out.println("Now replaying "+ listIterator.previous().toString());
                              forward = false;
                          }else{
                              System.out.println("We are at the start of the list");
                          }
                      }else {

                          if(listIterator.hasNext()){
                              System.out.println("Now replaying "+listIterator.next().toString());
                              forward = true;
                          }else{
                              System.out.println("We have reached the end of the list");
                          }



                      }

                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing"+ listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing"+ listIterator.previous());
                        }
                    }

                    break;

            }
        }

    }

    private static void printMenu(){

        System.out.println("Available actions:\npress ");
        System.out.println("0  to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n"+
                "4 - list songs in the playlist\n"+
                "5 - print available actions.\n"+
                "6 - delete current song from playlist");
    }

    private  static  void printList(LinkedList<Song> playList){

        Iterator<Song> iterator = playList.iterator();
        System.out.println("=============================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=============================");
    }
}
