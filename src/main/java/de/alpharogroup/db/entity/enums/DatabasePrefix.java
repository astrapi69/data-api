package de.alpharogroup.db.entity.enums; 

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum DatabasePrefix {
    SEQUENCE_NAME("seq_nm_"), SEQUENCE_GENERATOR_NAME("seq_gen_nm_"), INDEX("idx_");
    String prefix;
}
