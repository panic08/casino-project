package com.casino.auth.model;

import com.casino.auth.enums.UserDataProfileType;
import com.casino.auth.enums.UserDataRank;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserData {
    private Long id;
    private Long userId;
    private UserDataProfileType profileType;
    private String nickname;
    private Long balance;
    private UserDataRank rank;
    private String serverSeed;
    private String clientSeed;
}
