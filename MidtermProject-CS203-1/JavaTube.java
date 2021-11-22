import java.util.Arrays;
import java.util.Comparator;

public class JavaTube {
    public class SortVideosByTitle implements Comparator<Video> {

        @Override
        public int compare(Video o1, Video o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }

    public class SortVideosByViews implements Comparator<Video> {

        @Override
        public int compare(Video o1, Video o2) {
            return (o1.getViews() - o2.getViews());
        }
    }

    public void  sortCookingVideoByIngredientList(CookingVideo[] arr){
        class SortCookingVideosByIngredients implements Comparator<CookingVideo> {
            @Override
            public int compare(CookingVideo o1, CookingVideo o2) {
                return o1.getIngredientsList().length - o2.getIngredientsList().length;
            }
        }
        SortCookingVideosByIngredients  byIngredients = new SortCookingVideosByIngredients();
        Arrays.sort(arr, byIngredients);
    }

    public void  sortCookingVideoByServingSizeDescending(CookingVideo[] arr){
         Comparator<CookingVideo> byServing = new Comparator<CookingVideo>(){
             @Override
             public int compare(CookingVideo o1, CookingVideo o2) {
                 return (o1.getRecipe().getServings() - o2.getRecipe().getServings()) * -1;
             }
         };
         Arrays.sort(arr, byServing);
    }

    public void printAllCookingRecipies(CookingVideo[] arr){
        for (CookingVideo v : arr)
            v.printRecipe();
    }

    public void videoPrinter(Video[] arr){
        for (Video v : arr)
            System.out.println(v + "\n");
    }

    public static void main(String[] args){
        Recipe          r1 = new Recipe();
        Recipe          r2 = new Recipe("pizza", "tomato,flour,cheese",
                "make a bread. add tomato. add cheese", 10, 20, 5);
        CookingVideo    cv1 = new CookingVideo();
        CookingVideo    cv2 = new CookingVideo("learn OOP", 25, 3900,
                300, 234561.0, r2);

        CookingVideo    cv3 = new CookingVideo("javaScripts basics", 35.5,
                1900, 127, 34567.9, r1);
        GamingVideo     gv1 = new GamingVideo();
        GamingVideo    gv2 = new GamingVideo("learn OOP", 25, 3900,
                300, 234561.0, "soccer");

        GamingVideo    gv3 = new GamingVideo("javaScripts basics", 35.5,
                1900, 127, 34567.9, "tennis");
        Video[] allVideos = {cv1, cv2, cv3, gv1, gv2, gv3};
        CookingVideo[] cookingVideos = {cv1, cv2, cv3};
        GamingVideo[] gamingVideos = {gv1, gv2, gv3};
        JavaTube    jt = new JavaTube();
        JavaTube.SortVideosByTitle  byTitle = jt.new SortVideosByTitle();
        JavaTube.SortVideosByViews  byViews = jt.new SortVideosByViews();
        jt.videoPrinter(allVideos);
        System.out.println();
        Arrays.sort(allVideos, byTitle);
        jt.videoPrinter(allVideos);
        System.out.println();
        Arrays.sort(allVideos, byViews);
        jt.videoPrinter(allVideos);
        System.out.println();
        jt.printAllCookingRecipies(cookingVideos);
        jt.sortCookingVideoByIngredientList(cookingVideos);
        jt.videoPrinter(cookingVideos);
        System.out.println();
        jt.sortCookingVideoByServingSizeDescending(cookingVideos);
        jt.videoPrinter(cookingVideos);
        System.out.println();
        jt.printAllCookingRecipies(cookingVideos);
        VideoList   vl = new VideoList();
        for (int i = 0; i < cookingVideos.length; i++){
            vl.add(cookingVideos[i]);
        }
        for (int i = 0; i < gamingVideos.length; i++){
            vl.add(gamingVideos[i]);
        }
        System.out.println(vl);
    }
}
