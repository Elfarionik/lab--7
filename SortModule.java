package com.company;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class SortModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ISorter.class).annotatedWith(Names.named("Bubble")).to(BubbleSorter.class);
        bind(ISorter.class).annotatedWith(Names.named("Selection")).to(SelectionSorter.class);
        bind(ISorter.class).annotatedWith(Names.named("Insertion")).to(InsertionSorter.class);
    }
}
