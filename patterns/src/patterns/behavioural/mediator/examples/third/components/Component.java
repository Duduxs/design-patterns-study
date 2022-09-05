package patterns.behavioural.mediator.examples.third.components;

import patterns.behavioural.mediator.examples.third.mediators.Mediator;

public interface Component {

    void setMediator(Mediator mediator);
    String getName();

}
