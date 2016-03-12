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
        mAdvertisement.add(new Advertisement("Mcdonalds", "Restaurant/Cafe", R.drawable.a2));
        mAdvertisement.add(new Advertisement("File Swap", "Computers/Technology", R.drawable.a3));
        mAdvertisement.add(new Advertisement("Abel's Pet Market", "Pet", R.drawable.a4));
        mAdvertisement.add(new Advertisement("Mcdonalds", "Restaurant/Cafe", R.drawable.a5));
        mAdvertisement.add(new Advertisement("Energy Burner", "Health", R.drawable.a6));
        mAdvertisement.add(new Advertisement("Star Wars", "Movies Theatre", R.drawable.a7));
        mAdvertisement.add(new Advertisement("Last Minute Mobile", "Computers/Technology", R.drawable.a8));
        mAdvertisement.add(new Advertisement("Audible", "Computers/Technology", R.drawable.a9));
        mAdvertisement.add(new Advertisement("Traveling Dog.Net", "Pet",  R.drawable.a10));
        mAdvertisement.add(new Advertisement("STD ", "Lifestyle", R.drawable.a11));
        mAdvertisement.add(new Advertisement("Bullwacks Casino", "Hotel/Casino", R.drawable.a12));
        mAdvertisement.add(new Advertisement("Mobile Check", "Computers/Technology", R.drawable.a13));
        mAdvertisement.add(new Advertisement("Yahoo", "Computers/Technology", R.drawable.a14));
        mAdvertisement.add(new Advertisement("3D Issue", "Computers/Technology", R.drawable.a15));
        mAdvertisement.add(new Advertisement("FedEx", "Business Services", R.drawable.a16));
        mAdvertisement.add(new Advertisement("Ikea", "Furniture/Accessories", R.drawable.a17));
        mAdvertisement.add(new Advertisement("IMBA", "Travel/Leisure", R.drawable.a18));
        mAdvertisement.add(new Advertisement("Clearance", "Business", R.drawable.a19));
        mAdvertisement.add(new Advertisement("KitKat", "Food/Beverages", R.drawable.a20));
        mAdvertisement.add(new Advertisement("Bendigo", "Bank", R.drawable.a21));
        mAdvertisement.add(new Advertisement("Itunes", "Musician/Band", R.drawable.a22));
        mAdvertisement.add(new Advertisement("GAF", "Computers/Technology", R.drawable.a23));
        mAdvertisement.add(new Advertisement("Adidas", "Footwear", R.drawable.a24));
        mAdvertisement.add(new Advertisement("SoftLayer", "Computers/Technology", R.drawable.a25));
        mAdvertisement.add(new Advertisement("Quiz", "Computers/Technology", R.drawable.a26));
        mAdvertisement.add(new Advertisement("Unleash", "Business", R.drawable.a27));
        mAdvertisement.add(new Advertisement("DiabetesAA", "Health/Medical/Pharmacy", R.drawable.a28));
        mAdvertisement.add(new Advertisement("Chase", "Services", R.drawable.a29));
        mAdvertisement.add(new Advertisement("Hawaii Smart Shopper", "Lifestyle/Business", R.drawable.a30));
        mAdvertisement.add(new Advertisement("Bradleys", "Services", R.drawable.a31));
        mAdvertisement.add(new Advertisement("BookHotel", "Hotel", R.drawable.a32));
        mAdvertisement.add(new Advertisement("Deals", "Business", R.drawable.a33));
        mAdvertisement.add(new Advertisement("SpringNote", "Computers/Technology", R.drawable.a34));
        mAdvertisement.add(new Advertisement("Hobby/Lobby", "Travel/Leisure", R.drawable.a35));
        mAdvertisement.add(new Advertisement("Discover", "Bank", R.drawable.a36));
        mAdvertisement.add(new Advertisement("Samsung", "Appliance", R.drawable.a37));
        mAdvertisement.add(new Advertisement("Class", "Business", R.drawable.a38));
        mAdvertisement.add(new Advertisement("Save", "Computers/Technology", R.drawable.a39));
        mAdvertisement.add(new Advertisement("People", "Lifestyle", R.drawable.a40));
        mAdvertisement.add(new Advertisement("Abigail's Hotel", "Hotel", R.drawable.a41));
        mAdvertisement.add(new Advertisement("Photobox", "Customer Services", R.drawable.a42));
        mAdvertisement.add(new Advertisement("Mazda", "Automobiles and Parts", R.drawable.a43));
        mAdvertisement.add(new Advertisement("Pop Shop", "Entertainment", R.drawable.a44));
        mAdvertisement.add(new Advertisement("Low", "Business", R.drawable.a45));
        mAdvertisement.add(new Advertisement("Parent Brand", "Automobiles and Parts", R.drawable.a46));
        mAdvertisement.add(new Advertisement("Toy Story", "Entertainment", R.drawable.a47));



    }

    public List<Advertisement> getMovies() {
        return mAdvertisement;
    }
}
