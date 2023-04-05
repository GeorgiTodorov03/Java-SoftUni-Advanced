package ComparableBook_03;

import BookComparator_04.Book;

import java.util.Comparator;

public class BookComparator implements Comparator<BookComparator_04.Book> {

    @Override
    public int compare(BookComparator_04.Book f, Book s) {
        int result = f.getTitle().compareTo(s.getTitle());

        if (result == 0) {
            result = Integer.compare(f.getYear(), s.getYear());
        }
        return result;
    }
}
