import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.*;

public class MyExercises implements Exercises {


    @Override
    public Integer findSmallest(List<Integer> list) {

        int min = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) < min) {

                min = list.get(i);
            }
        }
        return min;
    }

    @Override
    public Integer findLargest(List<Integer> list) {

        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    @Override
    public boolean isEqual(Object o, Object o1) {

        if (o.equals(o1)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isSameObject(Object o, Object o1) {

        if (o == o1) {
            return true;
        }
        return false;
    }

    @Override
    public List<Integer> consume(Iterator<Integer> it) {

        List<Integer> listToIt = new ArrayList<>();

        while (it.hasNext()) {
            listToIt.add(it.next());
        }
        return listToIt;

    }

    @Override
    public int computeSumOfNumbers(int number) {

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }

        return sum;
    }

    @Override
    public int computeSumOfNumbers(int number, NumberFilter numberFilter) {

        int sum = 0;

        for (int i = 1; i <= number; i++) {

            if (numberFilter.accept(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }

    @Override
    public List<Integer> computeNumbersUpTo(int number) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> list) {

//        Returns a map containing number occurrences (mapping a number to the count of occurrences in a numbers list).
        Map<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {

            if (!hashmap.containsKey(list.get(i))) {

                hashmap.put(list.get(i), 1);

            } else {

                int occurrences = hashmap.get(list.get(i));
                occurrences++;
                hashmap.put(list.get(i), occurrences);
            }

        }
        return hashmap;
    }

    @Override
    public IntegerGenerator createIntegerGenerator(int from, int to) {


        return null;
    }

    @Override
    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator generator, NumberFilter filter) {
        return null;
    }
}
