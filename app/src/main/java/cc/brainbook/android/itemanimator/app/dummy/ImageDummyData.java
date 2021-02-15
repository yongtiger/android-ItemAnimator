package cc.brainbook.android.itemanimator.app.dummy;

import com.mikepenz.fastadapter.IItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cc.brainbook.android.itemanimator.app.items.ImageItem;

/**
 * Created by mikepenz on 08.01.16.
 */
public class ImageDummyData {

    public static ImageItem getDummyItem() {
        int ran = new Random().nextInt(3);
        if (ran == 0) {
            return new ImageItem().withName("NEW").withDescription("Newly added item").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/yang_zhuo_yong_cuo,_tibet-china-63.jpg");
        } else if (ran == 1) {
            return new ImageItem().withName("NEW").withDescription("Newly added item").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/yellowstone-united_states-17.jpg");
        } else {
            return new ImageItem().withName("NEW").withDescription("Newly added item").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/victoria-australia-31.jpg");
        }
    }

    public static List<IItem> getImages() {
        return toList(
                new ImageItem().withName("Yang Zhuo Yong Cuo, Tibet China").withDescription("#100063").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/yang_zhuo_yong_cuo,_tibet-china-63.jpg"),
                new ImageItem().withName("Yellowstone United States").withDescription("#100017").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/yellowstone-united_states-17.jpg"),
                new ImageItem().withName("Victoria Australia").withDescription("#100031").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/victoria-australia-31.jpg"),
                new ImageItem().withName("Valencia Spain").withDescription("#100082").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/valencia-spain-82.jpg"),
                new ImageItem().withName("Xigaze, Tibet China").withDescription("#100030").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/xigaze,_tibet-china-30.jpg"),
                new ImageItem().withName("Utah United States").withDescription("#100096").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/utah-united_states-96.jpg"),
                new ImageItem().withName("Utah United States").withDescription("#100015").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/utah-united_states-15.jpg"),
                new ImageItem().withName("Utah United States").withDescription("#100088").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/utah-united_states-88.jpg"),
                new ImageItem().withName("Umm Al Quwain United Arab Emirates").withDescription("#100013").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/umm_al_quwain-united_arab_emirates-13.jpg"),
                new ImageItem().withName("Texas United States").withDescription("#100026").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/texas-united_states-26.jpg"),
                new ImageItem().withName("Siuslaw National Forest United States").withDescription("#100092").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/siuslaw_national_forest-united_states-92.jpg"),
                new ImageItem().withName("The Minquiers Channel Islands").withDescription("#100069").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/the_minquiers-channel_islands-69.jpg"),
                new ImageItem().withName("Texas United States").withDescription("#100084").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/texas-united_states-84.jpg"),
                new ImageItem().withName("Tabuaeran Kiribati").withDescription("#100050").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/tabuaeran-kiribati-50.jpg"),
                new ImageItem().withName("Stanislaus River United States").withDescription("#100061").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/stanislaus_river-united_states-61.jpg"),
                new ImageItem().withName("Salinas Grandes Argentina").withDescription("#100025").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/salinas_grandes-argentina-25.jpg"),
                new ImageItem().withName("Shadegan Refuge Iran").withDescription("#100012").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/shadegan_refuge-iran-12.jpg"),
                new ImageItem().withName("San Pedro De Atacama Chile").withDescription("#100043").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/san_pedro_de_atacama-chile-43.jpg"),
                new ImageItem().withName("Ragged Island The Bahamas").withDescription("#100064").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/ragged_island-the_bahamas-64.jpg"),
                new ImageItem().withName("Qinghai Lake China").withDescription("#100080").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/qinghai_lake-china-80.jpg"),
                new ImageItem().withName("Qesm Al Wahat Ad Dakhlah Egypt").withDescription("#100056").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/qesm_al_wahat_ad_dakhlah-egypt-56.jpg"),
                new ImageItem().withName("Riedstadt Germany").withDescription("#100042").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/riedstadt-germany-42.jpg"),
                new ImageItem().withName("Redwood City United States").withDescription("#100048").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/redwood_city-united_states-48.jpg"),
                new ImageItem().withName("Nyingchi, Tibet China").withDescription("#100098").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/nyingchi,_tibet-china-98.jpg"),
                new ImageItem().withName("Ngari, Tibet China").withDescription("#100057").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/ngari,_tibet-china-57.jpg"),
                new ImageItem().withName("Pozoantiguo Spain").withDescription("#100099").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/pozoantiguo-spain-99.jpg"),
                new ImageItem().withName("Ningaloo Australia").withDescription("#100073").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/ningaloo-australia-73.jpg"),
                new ImageItem().withName("Niederzier Germany").withDescription("#100079").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/niederzier-germany-79.jpg"),
                new ImageItem().withName("Olympic Dam Australia").withDescription("#100065").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/olympic_dam-australia-65.jpg"),
                new ImageItem().withName("Peedamulla Australia").withDescription("#100040").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/peedamulla-australia-40.jpg"),
                new ImageItem().withName("Nevado Tres Cruces Park Chile").withDescription("#100089").withImage("https://raw.githubusercontent.com/mikepenz/earthview-wallpapers/develop/thumb/nevado_tres_cruces_park-chile-89.jpg")
        );
    }

    private static List<IItem> toList(ImageItem... imageItems) {
        ArrayList<IItem> items = new ArrayList<>();
        for (ImageItem imageItem : imageItems) {
            items.add(imageItem);
        }
        return items;
    }
}
