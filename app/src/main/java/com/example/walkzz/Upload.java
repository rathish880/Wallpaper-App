package com.example.walkzz;

public class Upload {

        private String mName;
        private String mCategory;
        private String mImageUrl;

        public Upload(){

        }




        public Upload(String name,String Category, String imageUrl) {
            if (name.trim().equals("")) {
                name = "No Name";
            }
            if(Category.trim().equals("")){
                Category="No Category";
            }

            mName = name;
            mCategory=Category;
            mImageUrl = imageUrl;
        }

    public String getmCategory() {
        return mCategory;
    }

    public void setmCategory(String mCategory) {
        this.mCategory = mCategory;
    }

    public String getName() {
            return mName;
        }



        public String getImageUrl() {
            return mImageUrl;
        }



    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }
}
