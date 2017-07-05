package com.example.sparken02.retrofitdemo;

import java.util.List;

/**
 * Created by sparken02 on 27/6/17.
 */

public class SongModel {
    /**
     * flag : true
     * data : [{"id":1,"song_path":"/public/song/Baarish (Half Girlfriend) -320Kbps [DJMaza.Life].mp3","images":"https://partyoflebanon.org/wp-content/uploads/2017/01/p05-5_211991_large-96x96.jpg?x32820","created_at":"2017-05-22 14:24:53","updated_at":"2017-05-27 05:53:56"},{"id":2,"song_path":"/public/song/Hamma Hamma (Ok Jaanu) 320 Kbps(MirchiZone.in).mp3","images":"https://partyoflebanon.org/wp-content/uploads/2016/10/Screen-Shot-2016-12-03-at-4.07.15-PM-96x96.png?x32820","created_at":"2017-05-22 14:25:27","updated_at":"2017-05-27 05:54:06"},{"id":3,"song_path":"/public/song/02 Kaun Tujhe (MS Dhoni) Palak 320Kbps.mp3","images":"https://partyoflebanon.org/wp-content/uploads/2016/03/p05-1_646952_large-96x96.jpg?x32820","created_at":"2017-05-22 14:25:27","updated_at":"2017-05-27 05:54:15"},{"id":4,"song_path":"/public/song/Kaabil Hoon-SenSongsMp3.Co.mp3","images":"https://partyoflebanon.org/wp-content/uploads/2016/04/jet-300x121.jpg?x32820","created_at":"2017-05-22 14:25:44","updated_at":"2017-05-27 05:54:31"},{"id":5,"song_path":"/public/song/channa _mereya_320kbps.mp3","images":"https://partyoflebanon.org/wp-content/uploads/2016/04/jet-300x121.jpg?x32820","created_at":"2017-05-22 14:25:44","updated_at":"2017-05-27 05:54:33"}]
     */

    private String flag;
    private List<DataBean> data;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * song_path : /public/song/Baarish (Half Girlfriend) -320Kbps [DJMaza.Life].mp3
         * images : https://partyoflebanon.org/wp-content/uploads/2017/01/p05-5_211991_large-96x96.jpg?x32820
         * created_at : 2017-05-22 14:24:53
         * updated_at : 2017-05-27 05:53:56
         */

        private int id;
        private String song_path;
        private String images;
        private String created_at;
        private String updated_at;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSong_path() {
            return song_path;
        }

        public void setSong_path(String song_path) {
            this.song_path = song_path;
        }

        public String getImages() {
            return images;
        }

        public void setImages(String images) {
            this.images = images;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }
    }
}
