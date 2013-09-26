package com.github.greengerong;


import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.Type;

public class OrikaMapper {
    public static MapperFacade mapperFactory() {
        MapperFactory factory = new DefaultMapperFactory.Builder().build();
        factory.getConverterFactory().registerConverter("activity2Option", stringListToOption());
        factory.registerClassMap(factory.classMap(Occupation.class, OccupationModel.class)
                .field("name", "text")
                .fieldMap("activities", "children").converter("activity2Option").add()
                .toClassMap());

        return factory.getMapperFacade();
    }

    private static CustomConverter<String, Option> stringListToOption() {
        return new CustomConverter<String, Option>() {

            @Override
            public Option convert(String source, Type<? extends Option> type) {
                return new Option(source);
            }
        };
    }
}
