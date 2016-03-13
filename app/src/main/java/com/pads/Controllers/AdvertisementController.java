package com.pads.Controllers;

import com.pads.Entities.Advertisement;
import com.pads.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by junvir on 3/13/2016.
 */
public class AdvertisementController {

    private List<Advertisement> mAdvertisement;

    public AdvertisementController() {
        // create all the advertisements here
        mAdvertisement = new ArrayList<>();
        mAdvertisement.add(new Advertisement("DIGIDAY", "Shopping/Retail", R.drawable.a1));
        mAdvertisement.add(new Advertisement("McDonalds", "Food/Beverages", R.drawable.a2));
        mAdvertisement.add(new Advertisement("File Swap", "Computers/Technology", R.drawable.a3));
        mAdvertisement.add(new Advertisement("Abel's Pet Market", "Pet Services", R.drawable.a4));
        mAdvertisement.add(new Advertisement("Mcdonalds", "Food/Beverages", R.drawable.a5));
        mAdvertisement.add(new Advertisement("Energy Burner", "Health/Beauty", R.drawable.a6));
        mAdvertisement.add(new Advertisement("Star Wars", "Movie", R.drawable.a7));
        mAdvertisement.add(new Advertisement("Last Minute Mobile", "Computers/Technology", R.drawable.a8));
        mAdvertisement.add(new Advertisement("Audible", "Computers/Technology", R.drawable.a9));
        mAdvertisement.add(new Advertisement("Traveling Dog.Net", "Pet Services", R.drawable.a10));
        mAdvertisement.add(new Advertisement("STD ", "Internet/Software", R.drawable.a11));
        mAdvertisement.add(new Advertisement("Bullwacks Casino", "Hotel", R.drawable.a12));
        mAdvertisement.add(new Advertisement("Citi Bank", "Bank", R.drawable.a13));
        mAdvertisement.add(new Advertisement("Yahoo", "Media/News/Publishing", R.drawable.a14));
        mAdvertisement.add(new Advertisement("3D Issue", "Media/News/Publishing", R.drawable.a15));
        mAdvertisement.add(new Advertisement("FedEx", "Product/Service", R.drawable.a16));
        mAdvertisement.add(new Advertisement("Ikea", "Furniture", R.drawable.a17));
        mAdvertisement.add(new Advertisement("IMBA", "Cause", R.drawable.a18));
        mAdvertisement.add(new Advertisement("Clearance", "Shopping", R.drawable.a19));
        mAdvertisement.add(new Advertisement("KitKat", "Food/Beverages", R.drawable.a20));
        mAdvertisement.add(new Advertisement("Bendigo", "Bank", R.drawable.a21));
        mAdvertisement.add(new Advertisement("Itunes", "Music", R.drawable.a22));
        mAdvertisement.add(new Advertisement("GAF", "Computers/Technology", R.drawable.a23));
        mAdvertisement.add(new Advertisement("Adidas", "Shopping", R.drawable.a24));
        mAdvertisement.add(new Advertisement("SoftLayer", "Internet/Software", R.drawable.a25));
        mAdvertisement.add(new Advertisement("Quiz", "Internet/Software", R.drawable.a26));
        mAdvertisement.add(new Advertisement("Unleash", "Electronics", R.drawable.a27));
        mAdvertisement.add(new Advertisement("DiabetesAA", "Health/Medical/Pharmacy", R.drawable.a28));
        mAdvertisement.add(new Advertisement("Chase", "Product/Service", R.drawable.a29));
        mAdvertisement.add(new Advertisement("Hawaii Smart Shopper", "Shopping/Retail", R.drawable.a30));
        mAdvertisement.add(new Advertisement("Bradleys", "Product/Service", R.drawable.a31));
        mAdvertisement.add(new Advertisement("BookHotel", "Hotel", R.drawable.a32));
        mAdvertisement.add(new Advertisement("Deals", "Shopping", R.drawable.a33));
        mAdvertisement.add(new Advertisement("SpringNote", "Internet/Software", R.drawable.a34));
        mAdvertisement.add(new Advertisement("Hobby/Lobby", "Travel/Leisure", R.drawable.a35));
        mAdvertisement.add(new Advertisement("Discover", "Retail and consumer merchandise", R.drawable.a36));
        mAdvertisement.add(new Advertisement("Samsung", "Appliance", R.drawable.a37));
        mAdvertisement.add(new Advertisement("Radisson Blu", "Hotel", R.drawable.a38));
        mAdvertisement.add(new Advertisement("Save", "Retail and consumer merchandise", R.drawable.a39));
        mAdvertisement.add(new Advertisement("People", "Internet/Software", R.drawable.a40));
        mAdvertisement.add(new Advertisement("Abigail's Hotel", "Pet Services", R.drawable.a41));
        mAdvertisement.add(new Advertisement("Photobox", "Internet Services", R.drawable.a42));
        mAdvertisement.add(new Advertisement("Mazda", "Automobiles and Parts", R.drawable.a43));
        mAdvertisement.add(new Advertisement("Pop Shop", "Entertainment", R.drawable.a44));
        mAdvertisement.add(new Advertisement("Low", "Business", R.drawable.a45));
        mAdvertisement.add(new Advertisement("Parent Brand", "Automobiles and Parts", R.drawable.a46));
        mAdvertisement.add(new Advertisement("Toy Story", "Entertainment", R.drawable.a47));

    }

    public List<Advertisement> getAds() {
        return mAdvertisement;
    }
}
