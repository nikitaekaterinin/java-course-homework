package org.example.homework10.Album;

import java.util.ArrayList;

public class Album {
    private String title;
    private SongList songList;

    public Album(String title) {
        this.title = title;
        this.songList = new SongList();
    }

    public String getTitle() {
        return title;
    }

    public boolean addSong(String title, double duration) {
        return this.songList.addSong(new Song(title, duration));
    }

    public Song findSongByTitle(String title) {
        return this.songList.findSongByTitle(title);
    }

    public Song findSongByTrackNumber(int trackNumber) {
        return this.songList.findSongByTrackNumber(trackNumber);
    }

    public class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean addSong(Song song) {
            if (findSongByTitle(song.getTitle()) != null) {
                return false;
            }
            songs.add(song);
            return true;
        }

        public Song findSongByTitle(String title) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        public Song findSongByTrackNumber(int trackNumber) {
            if (trackNumber > 0 && trackNumber <= songs.size()) {
                return songs.get(trackNumber - 1);
            }
            return null;
        }
    }

    public static class Song {
        private String title;
        private double duration;

        public Song(String title, double duration) {
            this.title = title;
            this.duration = duration;
        }

        public String getTitle() {
            return title;
        }

        public double getDuration() {
            return duration;
        }
    }

    public static void main(String[] args) {
        Album album = new Album("My Album");
        album.addSong("MySong 1", 3);
        album.addSong("MySong 2", 4);
        album.addSong("MySong 3", 5);

        System.out.println(album.findSongByTitle("MySong 2").getTitle());
        System.out.println(album.findSongByTrackNumber(3).getTitle());
    }
}