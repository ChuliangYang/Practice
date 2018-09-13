package com.me.cl.datingapp;

import java.util.List;

/**
 * Created by CL on 9/12/18.
 */
public class Date {

    private int total_matches;
    private PagingBean paging;
    private List<DataBean> data;

    public int getTotal_matches() {
        return total_matches;
    }

    public void setTotal_matches(int total_matches) {
        this.total_matches = total_matches;
    }

    public PagingBean getPaging() {
        return paging;
    }

    public void setPaging(PagingBean paging) {
        this.paging = paging;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class PagingBean {

        private CursorsBean cursors;

        public CursorsBean getCursors() {
            return cursors;
        }

        public void setCursors(CursorsBean cursors) {
            this.cursors = cursors;
        }

        public static class CursorsBean {

            private String before;
            private String current;
            private String after;

            public String getBefore() {
                return before;
            }

            public void setBefore(String before) {
                this.before = before;
            }

            public String getCurrent() {
                return current;
            }

            public void setCurrent(String current) {
                this.current = current;
            }

            public String getAfter() {
                return after;
            }

            public void setAfter(String after) {
                this.after = after;
            }
        }
    }

    public static class DataBean {

        private int enemy;
        private int relative;
        private int last_login;
        private int gender;
        private LocationBean location;
        private String userid;
        private int match;
        private boolean liked;
        private String state_code;
        private int orientation;
        private String country_name;
        private PhotoBean photo;
        private String state_name;
        private int age;
        private String country_code;
        private int friend;
        private int is_online;
        private String username;
        private String city_name;
        private String stoplight_color;
        private List<?> gender_tags;
        private List<Integer> last_contact_time;
        private List<?> orientation_tags;

        public int getEnemy() {
            return enemy;
        }

        public void setEnemy(int enemy) {
            this.enemy = enemy;
        }

        public int getRelative() {
            return relative;
        }

        public void setRelative(int relative) {
            this.relative = relative;
        }

        public int getLast_login() {
            return last_login;
        }

        public void setLast_login(int last_login) {
            this.last_login = last_login;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public int getMatch() {
            return match;
        }

        public void setMatch(int match) {
            this.match = match;
        }

        public boolean isLiked() {
            return liked;
        }

        public void setLiked(boolean liked) {
            this.liked = liked;
        }

        public String getState_code() {
            return state_code;
        }

        public void setState_code(String state_code) {
            this.state_code = state_code;
        }

        public int getOrientation() {
            return orientation;
        }

        public void setOrientation(int orientation) {
            this.orientation = orientation;
        }

        public String getCountry_name() {
            return country_name;
        }

        public void setCountry_name(String country_name) {
            this.country_name = country_name;
        }

        public PhotoBean getPhoto() {
            return photo;
        }

        public void setPhoto(PhotoBean photo) {
            this.photo = photo;
        }

        public String getState_name() {
            return state_name;
        }

        public void setState_name(String state_name) {
            this.state_name = state_name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCountry_code() {
            return country_code;
        }

        public void setCountry_code(String country_code) {
            this.country_code = country_code;
        }

        public int getFriend() {
            return friend;
        }

        public void setFriend(int friend) {
            this.friend = friend;
        }

        public int getIs_online() {
            return is_online;
        }

        public void setIs_online(int is_online) {
            this.is_online = is_online;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getCity_name() {
            return city_name;
        }

        public void setCity_name(String city_name) {
            this.city_name = city_name;
        }

        public String getStoplight_color() {
            return stoplight_color;
        }

        public void setStoplight_color(String stoplight_color) {
            this.stoplight_color = stoplight_color;
        }

        public List<?> getGender_tags() {
            return gender_tags;
        }

        public void setGender_tags(List<?> gender_tags) {
            this.gender_tags = gender_tags;
        }

        public List<Integer> getLast_contact_time() {
            return last_contact_time;
        }

        public void setLast_contact_time(List<Integer> last_contact_time) {
            this.last_contact_time = last_contact_time;
        }

        public List<?> getOrientation_tags() {
            return orientation_tags;
        }

        public void setOrientation_tags(List<?> orientation_tags) {
            this.orientation_tags = orientation_tags;
        }

        public static class LocationBean {
            /**
             * country_code : US
             * city_name : Brooklyn
             * country_name : United States
             * state_name : New York
             * state_code : NY
             */

            private String country_code;
            private String city_name;
            private String country_name;
            private String state_name;
            private String state_code;

            public String getCountry_code() {
                return country_code;
            }

            public void setCountry_code(String country_code) {
                this.country_code = country_code;
            }

            public String getCity_name() {
                return city_name;
            }

            public void setCity_name(String city_name) {
                this.city_name = city_name;
            }

            public String getCountry_name() {
                return country_name;
            }

            public void setCountry_name(String country_name) {
                this.country_name = country_name;
            }

            public String getState_name() {
                return state_name;
            }

            public void setState_name(String state_name) {
                this.state_name = state_name;
            }

            public String getState_code() {
                return state_code;
            }

            public void setState_code(String state_code) {
                this.state_code = state_code;
            }
        }

        public static class PhotoBean {

            private FullPathsBean full_paths;
            private String base_path;
            private OriginalSizeBean original_size;
            private int ordinal;
            private String id;
            private CropRectBean crop_rect;
            private String caption;
            private ThumbPathsBean thumb_paths;

            public FullPathsBean getFull_paths() {
                return full_paths;
            }

            public void setFull_paths(FullPathsBean full_paths) {
                this.full_paths = full_paths;
            }

            public String getBase_path() {
                return base_path;
            }

            public void setBase_path(String base_path) {
                this.base_path = base_path;
            }

            public OriginalSizeBean getOriginal_size() {
                return original_size;
            }

            public void setOriginal_size(OriginalSizeBean original_size) {
                this.original_size = original_size;
            }

            public int getOrdinal() {
                return ordinal;
            }

            public void setOrdinal(int ordinal) {
                this.ordinal = ordinal;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public CropRectBean getCrop_rect() {
                return crop_rect;
            }

            public void setCrop_rect(CropRectBean crop_rect) {
                this.crop_rect = crop_rect;
            }

            public String getCaption() {
                return caption;
            }

            public void setCaption(String caption) {
                this.caption = caption;
            }

            public ThumbPathsBean getThumb_paths() {
                return thumb_paths;
            }

            public void setThumb_paths(ThumbPathsBean thumb_paths) {
                this.thumb_paths = thumb_paths;
            }

            public static class FullPathsBean {

                private String large;
                private String small;
                private String medium;
                private String original;

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }

                public String getOriginal() {
                    return original;
                }

                public void setOriginal(String original) {
                    this.original = original;
                }
            }

            public static class OriginalSizeBean {

                private int width;
                private int height;

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }
            }

            public static class CropRectBean {

                private int height;
                private int y;
                private int width;
                private int x;

                public int getHeight() {
                    return height;
                }

                public void setHeight(int height) {
                    this.height = height;
                }

                public int getY() {
                    return y;
                }

                public void setY(int y) {
                    this.y = y;
                }

                public int getWidth() {
                    return width;
                }

                public void setWidth(int width) {
                    this.width = width;
                }

                public int getX() {
                    return x;
                }

                public void setX(int x) {
                    this.x = x;
                }
            }

            public static class ThumbPathsBean {

                private String large;
                private String desktop_match;
                private String small;
                private String medium;

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getDesktop_match() {
                    return desktop_match;
                }

                public void setDesktop_match(String desktop_match) {
                    this.desktop_match = desktop_match;
                }

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }
        }
    }
}
