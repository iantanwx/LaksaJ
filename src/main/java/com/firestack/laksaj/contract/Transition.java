package com.firestack.laksaj.contract;

import lombok.Data;
import lombok.experimental.Builder;

@Data
@Builder
public class Transition {
    private String name;
    private Field[] params;
}
