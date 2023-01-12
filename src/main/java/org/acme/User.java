package org.acme;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//TODO This xml thing
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String firstName;

    String lastName;

    String cprNumber;

    String bankId;

    String uniqueId;
}
