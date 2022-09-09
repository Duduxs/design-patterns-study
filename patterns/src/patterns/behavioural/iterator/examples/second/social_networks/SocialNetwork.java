package patterns.behavioural.iterator.examples.second.social_networks;

import patterns.behavioural.iterator.examples.second.iterators.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);

}
