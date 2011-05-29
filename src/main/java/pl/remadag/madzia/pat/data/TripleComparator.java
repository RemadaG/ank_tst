package pl.remadag.madzia.pat.data;

import java.util.Comparator;

/**
 * Comparator
 */
public class TripleComparator implements Comparator<ComplexTriple> {

    @Override
    public int compare(ComplexTriple complexTriple1, ComplexTriple complexTriple2) {
        int ans1 = complexTriple1.getAnswer();
        int ans2 = complexTriple2.getAnswer();

        if (ans1 > ans2)
            return -1;
        else if (ans1 < ans2)
            return 1;
        else {
            int count1 = complexTriple1.getAnswerCount();
            int count2 = complexTriple2.getAnswerCount();
            if (count1 > count2)
                return -1;
            else if (count1 < count2)
                return 1;
            else
                return 0;
        }

    }

}
