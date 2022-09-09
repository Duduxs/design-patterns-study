package patterns.behavioural.iterator.examples.second.iterators;

import patterns.behavioural.iterator.examples.second.profile.Profile;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();

}
