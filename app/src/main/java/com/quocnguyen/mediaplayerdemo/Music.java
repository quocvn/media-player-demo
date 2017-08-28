package com.quocnguyen.mediaplayerdemo;

/**
 * Created by quocnguyen on 14/07/2017.
 */
public class Music {
    private String name;
    private String singer;
    private int song;

    public Music(String name, String singer, int song) {
        this.name = name;
        this.singer = singer;
        this.song = song;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }
}
