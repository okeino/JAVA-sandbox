package com;

import com.okeino2.Song;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by okeinomcgowan on 14/05/2017.
 */
public class Album {

    private String albumName;
    private String artist;
    private ArrayList<Song> albumSongs;

    public Album(String albumName,String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.albumSongs = new ArrayList<>();


    }



    public  boolean newSong(String name,double time){

        if(findSong(name) == null){

            this.albumSongs.add(new Song(name,time));
            return true;
        }


        return false;
    }



    // below here we can get album name and list of songs

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getAlbumSongs() {
        return albumSongs;
    }


    //find and check if song on the album

    private Song findSong(String searchSong){

        //System.out.println("array size:"+ contactsList.size());

        for (Song checkedSong: this.albumSongs)
        {
            if(checkedSong.getTitle().equals(searchSong)){
                return checkedSong;

            }

        }

        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){

        int index = trackNumber - 1;
        if((index >0) && (index <= this.albumSongs.size())){

            playList.add(this.albumSongs.get(index));
            return  true;
        }
        System.out.println("This album does not have a track"+ trackNumber);
        return  false;
    }

     public  boolean addToPlayList(String title, LinkedList<Song> playList){

        Song checkedSong = findSong(title);

        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
         System.out.println("The song "+title+" is not in the album");
        return false;
     }




}
