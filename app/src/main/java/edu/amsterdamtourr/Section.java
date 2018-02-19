package edu.amsterdamtourr;

/**
 * Created by edu on 7/10/2017.
 */

public class Section {
    private String mImageDescription;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Section(int imageResourceId, String imageDescription) {
        mImageDescription=imageDescription;
        mImageResourceId=imageResourceId;
    }

   public String getImageDescription(){
       return mImageDescription;
   }

   public int getImageResourceId(){
       return mImageResourceId;
   }
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
  }