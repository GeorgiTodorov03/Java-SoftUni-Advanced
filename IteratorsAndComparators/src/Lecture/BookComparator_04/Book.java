package BookComparator_04;

import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{
    private String title;
    private int year;
    private List<String> authors;

    @Override
    public int compareTo(Book o) {
        int result = this.title.compareTo(o.getTitle());

        if (result == 0) {
            result = Integer.compare(this.getYear(), o.getYear());
        }
        return result;
    }
    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = Arrays.asList(authors);
    }


}
