package pojos.lessonManagement;

import java.util.ArrayList;

    public class LessonProgramPojo {
        private String day;
        private Integer educationTermId;

        private ArrayList<Integer> lessonIdList;

        private String startTime;
        private String stopTime;

        @org.jetbrains.annotations.Contract(pure = true)
        public LessonProgramPojo() {
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public Integer getEducationTermId() {
            return educationTermId;
        }

        public void setEducationTermId(Integer educationTermId) {
            this.educationTermId = educationTermId;
        }


        public ArrayList<Integer> getLessonIdList() {
            return lessonIdList;
        }

        public void setLessonIdList(ArrayList<Integer> lessonIdList) {
            this.lessonIdList = lessonIdList;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getStopTime() {
            return stopTime;
        }

        public void setStopTime(String stopTime) {
            this.stopTime = stopTime;
        }

        @Override
        public String toString() {
            return "LessonProgromPojo{" +
                    "day='" + day + '\'' +
                    ", educationTermId=" + educationTermId +
                    ", lessonIdList=" + lessonIdList +
                    ", startTime='" + startTime + '\'' +
                    ", stopTime='" + stopTime + '\'' +
                    '}';
        }

    }


