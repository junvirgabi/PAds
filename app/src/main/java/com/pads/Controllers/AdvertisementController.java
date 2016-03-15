package com.pads.Controllers;

import com.pads.Entities.Advertisement;
import com.pads.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by junvir on 3/13/2016.
 */
public class AdvertisementController {

    private List<Advertisement> mAdvertisementsList;

    public AdvertisementController() {
        // create all the advertisements here
        mAdvertisementsList = new ArrayList<>();
        mAdvertisementsList.add(new Advertisement("DIGIDAY", "Shopping/Retail", R.drawable.a1));
        mAdvertisementsList.add(new Advertisement("McDonalds", "Food/Beverages", R.drawable.a2));
        mAdvertisementsList.add(new Advertisement("File Swap", "Computers/Technology", R.drawable.a3));
        mAdvertisementsList.add(new Advertisement("Abel's Pet Market", "Pet Services", R.drawable.a4));
        mAdvertisementsList.add(new Advertisement("Mcdonalds", "Food/Beverages", R.drawable.a5));
        mAdvertisementsList.add(new Advertisement("Energy Burner", "Health/Beauty", R.drawable.a6));
        mAdvertisementsList.add(new Advertisement("Star Wars", "Movie", R.drawable.a7));
        mAdvertisementsList.add(new Advertisement("Last Minute Mobile", "Computers/Technology", R.drawable.a8));
        mAdvertisementsList.add(new Advertisement("Audible", "Computers/Technology", R.drawable.a9));
        mAdvertisementsList.add(new Advertisement("Traveling Dog.Net", "Pet Services", R.drawable.a10));
        mAdvertisementsList.add(new Advertisement("STD ", "Internet/Software", R.drawable.a11));
        mAdvertisementsList.add(new Advertisement("Bullwacks Casino", "Hotel", R.drawable.a12));
        mAdvertisementsList.add(new Advertisement("Citi Bank", "Bank", R.drawable.a13));
        mAdvertisementsList.add(new Advertisement("Yahoo", "Media/News/Publishing", R.drawable.a14));
        mAdvertisementsList.add(new Advertisement("3D Issue", "Media/News/Publishing", R.drawable.a15));
        mAdvertisementsList.add(new Advertisement("FedEx", "Product/Service", R.drawable.a16));
        mAdvertisementsList.add(new Advertisement("Ikea", "Furniture", R.drawable.a17));
        mAdvertisementsList.add(new Advertisement("IMBA", "Cause", R.drawable.a18));
        mAdvertisementsList.add(new Advertisement("Clearance", "Shopping", R.drawable.a19));
        mAdvertisementsList.add(new Advertisement("KitKat", "Food/Beverages", R.drawable.a20));
        mAdvertisementsList.add(new Advertisement("Bendigo", "Bank", R.drawable.a21));
        mAdvertisementsList.add(new Advertisement("Itunes", "Music", R.drawable.a22));
        mAdvertisementsList.add(new Advertisement("GAF", "Computers/Technology", R.drawable.a23));
        mAdvertisementsList.add(new Advertisement("Adidas", "Shopping", R.drawable.a24));
        mAdvertisementsList.add(new Advertisement("SoftLayer", "Internet/Software", R.drawable.a25));
        mAdvertisementsList.add(new Advertisement("Quiz", "Internet/Software", R.drawable.a26));
        mAdvertisementsList.add(new Advertisement("Unleash", "Electronics", R.drawable.a27));
        mAdvertisementsList.add(new Advertisement("DiabetesAA", "Health/Medical/Pharmacy", R.drawable.a28));
        mAdvertisementsList.add(new Advertisement("Chase", "Product/Service", R.drawable.a29));
        mAdvertisementsList.add(new Advertisement("Hawaii Smart Shopper", "Shopping/Retail", R.drawable.a30));
        mAdvertisementsList.add(new Advertisement("Bradleys", "Product/Service", R.drawable.a31));
        mAdvertisementsList.add(new Advertisement("BookHotel", "Hotel", R.drawable.a32));
        mAdvertisementsList.add(new Advertisement("Deals", "Shopping", R.drawable.a33));
        mAdvertisementsList.add(new Advertisement("SpringNote", "Internet/Software", R.drawable.a34));
        mAdvertisementsList.add(new Advertisement("Hobby/Lobby", "Travel/Leisure", R.drawable.a35));
        mAdvertisementsList.add(new Advertisement("Discover", "Retail and consumer merchandise", R.drawable.a36));
        mAdvertisementsList.add(new Advertisement("Samsung", "Appliance", R.drawable.a37));
        mAdvertisementsList.add(new Advertisement("Radisson Blu", "Hotel", R.drawable.a38));
        mAdvertisementsList.add(new Advertisement("Save", "Retail and consumer merchandise", R.drawable.a39));
        mAdvertisementsList.add(new Advertisement("People", "Internet/Software", R.drawable.a40));
        mAdvertisementsList.add(new Advertisement("Abigail's Hotel", "Pet Services", R.drawable.a41));
        mAdvertisementsList.add(new Advertisement("Photobox", "Internet Services", R.drawable.a42));
        mAdvertisementsList.add(new Advertisement("Mazda", "Automobiles and Parts", R.drawable.a43));
        mAdvertisementsList.add(new Advertisement("Pop Shop", "Entertainment", R.drawable.a44));
        mAdvertisementsList.add(new Advertisement("Low", "Business", R.drawable.a45));
        mAdvertisementsList.add(new Advertisement("Parent Brand", "Automobiles and Parts", R.drawable.a46));
        mAdvertisementsList.add(new Advertisement("Toy Story", "Entertainment", R.drawable.a47));

    }

    public List<Advertisement> getAds() {
        return mAdvertisementsList;
    }
}
