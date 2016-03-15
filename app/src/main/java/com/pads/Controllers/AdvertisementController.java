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
        mAdvertisementsList.add(new Advertisement("http://digiday.com/","DIGIDAY", "Media/News/Publishing", R.drawable.a1));
        mAdvertisementsList.add(new Advertisement("https://www.mcdonalds.com.ph/","McDonalds", "Food/Beverages", R.drawable.a2));
        mAdvertisementsList.add(new Advertisement("https://www.fileswap.com/","File Swap", "Computers/Technology", R.drawable.a3));
        mAdvertisementsList.add(new Advertisement("http://www.abelpetsupply.com/","Abel's Pet Market", "Pet Services", R.drawable.a4));
        mAdvertisementsList.add(new Advertisement("https://www.mcdonalds.com.ph/","Mcdonalds", "Food/Beverages", R.drawable.a5));
        mAdvertisementsList.add(new Advertisement("http://burnerenergy.com/services/","Energy Burner", "Health/Beauty", R.drawable.a6));
        mAdvertisementsList.add(new Advertisement("http://www.starwars.com/","Star Wars", "Movie", R.drawable.a7));
        mAdvertisementsList.add(new Advertisement("http://m.lastminute.com/","Last Minute Mobile", "Computers/Technology", R.drawable.a8));
        mAdvertisementsList.add(new Advertisement("http://www.amazon.com/b?node=2402172011","Audible", "Computers/Technology", R.drawable.a9));
        mAdvertisementsList.add(new Advertisement("http://www.dogtravelcompany.net/","Traveling Dog.Net", "Pet Services", R.drawable.a10));
        mAdvertisementsList.add(new Advertisement("https://en.wikipedia.org/wiki/Internet_Standard","STD ", "Internet/Software", R.drawable.a11));
        mAdvertisementsList.add(new Advertisement("https://www.tripadvisor.com.ph/Attraction_Review-g33319-d276039-Reviews-Bullwhackers_Casino-Black_Hawk_Colorado.html","Bullwacks Casino", "Hotel", R.drawable.a12));
        mAdvertisementsList.add(new Advertisement("https://www.citibank.com.ph/portal/citiph_home.htm","Citi Bank", "Bank", R.drawable.a13));
        mAdvertisementsList.add(new Advertisement("http://yahoomail.com/","Yahoo", "Media/News/Publishing", R.drawable.a14));
        mAdvertisementsList.add(new Advertisement("https://www.3dissue.com/","3D Issue", "Media/News/Publishing", R.drawable.a15));
        mAdvertisementsList.add(new Advertisement("http://www.fedex.com/us/","  FedEx", "Product/Service", R.drawable.a16));
        mAdvertisementsList.add(new Advertisement("http://www.ikea.com/","Ikea", "Furniture", R.drawable.a17));
        mAdvertisementsList.add(new Advertisement("https://www.imba.com/","IMBA", "Cause", R.drawable.a18));
        mAdvertisementsList.add(new Advertisement("https://en.wikipedia.org/wiki/Clearance","Clearance", "Shopping", R.drawable.a19));
        mAdvertisementsList.add(new Advertisement("https://www.kitkat.com/","KitKat", "Food/Beverages", R.drawable.a20));
        mAdvertisementsList.add(new Advertisement("https://www.bendigobank.com.au/public/","Bendigo", "Bank", R.drawable.a21));
        mAdvertisementsList.add(new Advertisement("http://www.apple.com/itunes/","Itunes", "Music", R.drawable.a22));
        mAdvertisementsList.add(new Advertisement("http://www.gaf.com/","GAF", "Computers/Technology", R.drawable.a23));
        mAdvertisementsList.add(new Advertisement("http://shop.adidas.com.ph/?gclid=Cj0KEQjw5Z63BRCLqqLtpc6dk7gBEiQA0OuhsLRQSX5m9kkstuwkcu_KoRScG-H7OlAmcDJmscFxBygaAmLs8P8HAQ","Adidas", "Shopping", R.drawable.a24));
        mAdvertisementsList.add(new Advertisement("http://www.softlayer.com/info/break-boundaries-compute?utm_source=google&utm_medium=cpc&utm_content=Brand_-_SoftLayer&utm_campaign=AP_-_ASEAN_-_English_-_Philippines_-_Search_-_Google_-_Brand&utm_term=softlayer&matchtype=e&_bt=95792409482&_bk=softlayer&_bm=e&adgroup=Brand_-_SoftLayer","SoftLayer", "Internet/Software", R.drawable.a25));
        mAdvertisementsList.add(new Advertisement("http://www.buzzfeed.com/quizzes","Quiz", "Internet/Software", R.drawable.a26));
        mAdvertisementsList.add(new Advertisement("http://www.merriam-webster.com/dictionary/unleash","Unleash", "Electronics", R.drawable.a27));
        mAdvertisementsList.add(new Advertisement("http://www.medicalnewstoday.com/info/diabetes/","DiabetesAA", "Health/Medical/Pharmacy", R.drawable.a28));
        mAdvertisementsList.add(new Advertisement("https://www.chase.com/","Chase", "Product/Service", R.drawable.a29));
        mAdvertisementsList.add(new Advertisement("http://sanctuaries.noaa.gov/dolphinsmart/operator_corner/hawaii.html","Hawaii Smart Shopper", "Shopping/Retail", R.drawable.a30));
        mAdvertisementsList.add(new Advertisement("http://www.bradleysautoplace.com/index.shtml","Bradleys", "Product/Service", R.drawable.a31));
        mAdvertisementsList.add(new Advertisement("http://www.booking.com/index.html?aid=309654;label=booking-be-en-ausnz-gmEAI8uzGCctloWLxbyGqAS49564843372:pl:ta:p1:p2812,000:ac:ap1t1:neg:fi:tikwd-22550641:lp1011159:li:dec:dm;ws=&gclid=Cj0KEQjw5Z63BRCLqqLtpc6dk7gBEiQA0OuhsC4U2FlVOJ-1zgIKVB18YRxjeIlsPK23_bIw40LogVMaAqLp8P8HAQ","BookHotel", "Hotel", R.drawable.a32));
        mAdvertisementsList.add(new Advertisement("http://www.metrodeal.com/online-shopping","Deals", "Shopping", R.drawable.a33));
        mAdvertisementsList.add(new Advertisement("http://download.cnet.com/Springnote/3000-18483_4-10770979.html","SpringNote", "Internet/Software", R.drawable.a34));
        mAdvertisementsList.add(new Advertisement("http://www.hobbylobby.com/","Hobby/Lobby", "Travel/Leisure", R.drawable.a35));
        mAdvertisementsList.add(new Advertisement("https://www.discover.com/","Discover", "Retail and consumer merchandise", R.drawable.a36));
        mAdvertisementsList.add(new Advertisement("http://www.samsung.com/ph/home/","Samsung", "Appliance", R.drawable.a37));
        mAdvertisementsList.add(new Advertisement("https://www.radissonblu.com/en?facilitator=GOOGLECHAP&csref=se.bmm_corebrand_AP-Radisson.blu-cb_Core.Brand_radisson.blu_Exact","Radisson Blu", "Hotel", R.drawable.a38));
        mAdvertisementsList.add(new Advertisement("http://www.thesaurus.com/browse/save","Save", "Retail and consumer merchandise", R.drawable.a39));
        mAdvertisementsList.add(new Advertisement("http://www.people.com/people/","People", "Internet/Software", R.drawable.a40));
        mAdvertisementsList.add(new Advertisement("http://www.booking.com/searchresults.en-gb.html?aid=311984;label=abigail-s-IVTZx1mtXyrLkS6QS8OuTQS78676191182%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap1t1%3Aneg%3Afi%3Atikwd-1634232614%3Alp1011159%3Ali%3Adec%3Adm;sid=a9e1e3a35533fbf56d7cf8b0e60aec29;dcid=12;dest_id=-575350;dest_type=city;highlighted_hotels=185433;hlrd=1;redirected=1;source=hotel&tfl_cwh=1","Abigail's Hotel", "Pet Services", R.drawable.a41));
        mAdvertisementsList.add(new Advertisement("https://www.photobox.co.uk/a/","Photobox", "Internet Services", R.drawable.a42));
        mAdvertisementsList.add(new Advertisement("http://www.mazda.ph/","Mazda", "Automobiles and Parts", R.drawable.a43));
        mAdvertisementsList.add(new Advertisement("http://www.thepopshopusa.com/","Pop Shop", "Entertainment", R.drawable.a44));
        mAdvertisementsList.add(new Advertisement("http://www.chairkickers.com/","Low", "Business", R.drawable.a45));
        mAdvertisementsList.add(new Advertisement("http://www.mbaskool.com/business-concepts/marketing-and-strategy-terms/6759-parent-brand.html","Parent Brand", "Automobiles and Parts", R.drawable.a46));
        mAdvertisementsList.add(new Advertisement("https://en.wikipedia.org/wiki/Toy_Story","Toy Story", "Entertainment", R.drawable.a47));

    }

    public List<Advertisement> getAds() {
        return mAdvertisementsList;
    }
}
