package kfreq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Neww {
    public static void main(String[] args) {
        List <String> li = Arrays.asList("hello","skibidi","kaicenet","fsdsgd");
        List<Integer> len = new ArrayList<>();
        len =li.stream().map(a-> a.length()).collect(Collectors.toList());

    }
}
