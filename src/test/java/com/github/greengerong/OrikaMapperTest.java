package com.github.greengerong;

import ma.glasnost.orika.MapperFacade;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OrikaMapperTest {

    @Test
    public void shouldMap() throws Exception {
        final Occupation occupation = new Occupation();
        occupation.setName("name");
        occupation.setActivities(Arrays.asList("activety1", "activety2"));

        final MapperFacade mapper = OrikaMapper.mapperFactory();
        final OccupationModel model = mapper.map(occupation, OccupationModel.class);

        assertThat(model.getText(), is(occupation.getName()));

        for (int i = 0; i < occupation.getActivities().size(); i++) {
            assertThat(model.getChildren().get(i).getId(), is(occupation.getActivities().get(i)));
            assertThat(model.getChildren().get(i).getText(), is(occupation.getActivities().get(i)));
        }
    }
}
