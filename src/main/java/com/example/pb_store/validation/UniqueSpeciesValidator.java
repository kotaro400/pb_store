package com.example.pb_store.validation;

import com.example.pb_store.domain.Individual;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueSpeciesValidator implements ConstraintValidator<UniqueSpecies, List<Individual>>{
    @Override
    public void initialize(UniqueSpecies constraintAnnotation) {
    }

    @Override
    public boolean isValid(List<Individual> individuals, ConstraintValidatorContext constraintValidatorContext) {
        List<Integer> speciesIdList = individuals.stream().map(Individual::getSpeciesId).filter(
                Objects::nonNull).collect(Collectors.toList());
        List<Integer> speciesIdListWithoutDuplicates = speciesIdList.stream().distinct().collect(Collectors.toList());
        return speciesIdList.size() == speciesIdListWithoutDuplicates.size();
    }
}
