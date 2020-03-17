public class Bucket {
    public int contenu;
    public int capacite;

    public Bucket(int contenu, int capacite) {
        this.capacite = capacite;
        this.contenu = contenu;
    }

    public boolean isEmpty() {
        if (this.contenu == 0)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (this.contenu == this.capacite)
            return true;
        else
            return false;

    }

    public void remplir() {
        if (!this.isFull()) {
            this.contenu = this.capacite;
        }
    }

    public void vider() {
        if (!this.isEmpty()) {
            this.contenu = 0;
        }

    }
    public Bucket copy(){
        return new Bucket(this.contenu,this.capacite)

    }

    public static void transvaser(Bucket source, Bucket destination) {
        while (!source.isEmpty() || !destination.isFull()) {
            source.contenu--;
            destination.contenu++;
        }
    }
}
