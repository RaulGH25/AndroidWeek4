package gh25.raul.raulghweek3;

import java.util.ArrayList;

/**
 * Created by Raul on 09/05/2016.
 */
public class Mascota {
    private String name;
    private int likes = 0;
    private int photoID;
    private int id;


    public Mascota(String name, int photoID, int id) {
        this.photoID = photoID;
        this.name = name;
        this.id = id;
    }

    public Mascota(String name, int photoID, int id, int likes) {
        this.photoID = photoID;
        this.name = name;
        this.id = id;
        this.likes = likes;
    }

    public int getPhotoID() {
        return photoID;
    }

    public String getName() {
        return name;
    }


    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    void increaseLikes(){
        this.likes = this.likes + 1;
    }


    static ArrayList<Mascota> getdatasetMascotas(){
        ArrayList<Mascota> datasetMascotas = null;
        datasetMascotas = new ArrayList<>();
        datasetMascotas.add(new Mascota("Mascota 1", R.drawable.mascota1, 1));
        datasetMascotas.add(new Mascota("Mascota 2", R.drawable.mascota2, 2));
        datasetMascotas.add(new Mascota("Mascota 3", R.drawable.mascota3, 3));
        datasetMascotas.add(new Mascota("Mascota 4", R.drawable.mascota4, 4));
        datasetMascotas.add(new Mascota("Mascota 5", R.drawable.mascota5, 5));
        datasetMascotas.add(new Mascota("Mascota 6", R.drawable.mascota6, 6));
        datasetMascotas.add(new Mascota("Mascota 7", R.drawable.mascota7, 7));
        return(datasetMascotas);
    }

    static ArrayList<Mascota> getdatasetMascotasFavoritas(){
        ArrayList<Mascota> datasetMascotas = null;
        datasetMascotas = new ArrayList<>();
        datasetMascotas.add(new Mascota("Mascota 1", R.drawable.mascota1, 1));
        datasetMascotas.add(new Mascota("Mascota 2", R.drawable.mascota2, 2));
        datasetMascotas.add(new Mascota("Mascota 3", R.drawable.mascota3, 3));
        datasetMascotas.add(new Mascota("Mascota 4", R.drawable.mascota4, 4));
        datasetMascotas.add(new Mascota("Mascota 5", R.drawable.mascota5, 5));
        return(datasetMascotas);
    }

}
