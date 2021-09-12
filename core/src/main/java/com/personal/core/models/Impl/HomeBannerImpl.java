package com.personal.core.models.Impl;

import com.personal.core.models.HomeBanner;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
adapters = HomeBanner.class,
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HomeBannerImpl implements HomeBanner {

    @Inject
    String myfirsttext;

    @Inject
    String secondfield;

    @Inject
    String multilinefield;

    @ValueMapValue
    String button;

    @ValueMapValue
    String fileReference;

    @ValueMapValue
    String path;

    @Override
    public String getFullname() {
        return secondfield;
    }

    @Override
    public String getBio() {
        return myfirsttext;
    }

    @Override
    public String getIntro() {
        return multilinefield;
    }

    @Override
    public String getButton() {
        return button;
    }

    @Override
    public String getImage() {
        return fileReference;
    }

    @Override
    public String getPath() { return path;}
}
