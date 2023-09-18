   public class Music {

        private String title;
        private String duration;
        private  String genre;
        private  Date releaseDate;
        private  Singer singer;
        Music(String title,String duration,String genre,Date releaseDate,Singer singer){
            this.setTitle(title);
            this.setDuration(duration);
            this.setGenre(genre);
            this.setReleaseDate(releaseDate);
            this.setSinger(singer);
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public Date getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
        }

        public Singer getSinger() {
            return singer;
        }

        public void setSinger(Singer singer) {
            this.singer = singer;
        }
        public  String toString(){
            return String.format("%12s%12s%12s%12s%12s",this.title,this.duration,this.genre,this.releaseDate,this.singer);
        }



    }

