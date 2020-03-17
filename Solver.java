import java.util.ArrayDeque;
import java.util.ArrayList;

public class Solver {

    ArrayDeque<State> Open = new ArrayDeque();
    ArrayList<State> close = new ArrayList();



    public Solver(){}

    public void generateStates(State formerState){

        for(int i = 0; i< formerState.numberOfBuckets ; i++){
            State child = formerState.copier();
            Bucket tempA = formerState.states.get(i).copy();
            tempA.remplir();
            child.states.set(i,tempA);
            Open.addFirst(child);

            }
        for(int i = 0; i< formerState.numberOfBuckets ; i++){
            State child = formerState.copier();
            Bucket tempB = formerState.states.get(i).copy();
            tempB.vider();
            child.states.set(i,tempB);
            Open.addFirst(child);

        }

        for(int i = 0; i< formerState.numberOfBuckets ; i++) {
            Bucket tempC1 = formerState.states.get(i).copy();
            for (int j = 1; j < formerState.numberOfBuckets; j++) {
                State child = formerState.copier();
                Bucket tempC2 = formerState.states.get(j).copy();
                Bucket.transvaser(tempC1, tempC2);
                child.states.set(i, tempC1);
                child.states.set(j, tempC2);
                Open.addFirst(child);

            }
        }
        for(int i = 0; i< formerState.numberOfBuckets ; i++) {
            Bucket tempC1 = formerState.states.get(i).copy();
            for (int j = 1; j < formerState.numberOfBuckets; j++) {
                State child = formerState.copier();
                Bucket tempC2 = formerState.states.get(j).copy();
                Bucket.transvaser(tempC2, tempC1);
                child.states.set(i, tempC1);
                child.states.set(j, tempC2);
                Open.addFirst(child);

            }
        }
            


        }
    }


}
