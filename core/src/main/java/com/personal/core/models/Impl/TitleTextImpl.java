package com.personal.core.models.Impl;

import com.personal.core.models.TitleText;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,adapters = TitleText.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TitleTextImpl implements TitleText {

    @Inject
    String title;

    @Inject
    String info;

    @Inject
    Boolean paddingbottom;

    @Inject
    Boolean sectiongap;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public Boolean isPaddingbottom() {
        return paddingbottom;
    }

    @Override
    public Boolean isSectiongap() {
        return sectiongap;
    }
}
