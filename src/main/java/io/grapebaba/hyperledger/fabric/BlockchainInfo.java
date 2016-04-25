package io.grapebaba.hyperledger.fabric;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BlockchainInfo {
    private long height;

    private String currentBlockHash;

    private String previousBlockHash;

}
