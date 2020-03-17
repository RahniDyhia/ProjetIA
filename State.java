import java.util.ArrayList;

public class State {
    public int numberOfBuckets;
    public ArrayList<Bucket> states;
    public ArrayList<Integer> capacityList;
    public ArrayList<Integer> Etat;

    public State(int numberOfBuckets, ArrayList capacityList) {
        this.numberOfBuckets = numberOfBuckets;
        states = new ArrayList<Bucket>(numberOfBuckets);
        for (int i = 0; i < numberOfBuckets; i++) {
            for (int j = 0; j < numberOfBuckets; j++) {
                states.add(i,new Bucket(0, (int) capacityList.get(j)));

            }
        }
        Etat = new ArrayList<Integer>(numberOfBuckets);
        for (int u = 0; u < numberOfBuckets; u++){
            Etat.add(u,states.get(u).contenu);
        }
    }

    public State(int numberOfBuckets) {
        this.numberOfBuckets = numberOfBuckets;
        states = new ArrayList<Bucket>(numberOfBuckets);
        Etat = new ArrayList<Integer>(numberOfBuckets);
    }

    public State copier() {
        State thecopy = new State(this.numberOfBuckets)
        for (int i = 0; i < this.numberOfBuckets; i++) {
            thecopy.states.set(i, this.states.get(i).copy());
            thecopy.Etat.set(i,this.Etat.get(i));}
        return thecopy;
    }
}
