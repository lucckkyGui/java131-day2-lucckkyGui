package ex1.tbierzanowski;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class StreamSorter {

    public List<String> sortDesc(List<String> unsortedList){
        return unsortedList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
