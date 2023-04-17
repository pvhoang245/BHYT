package bhyt.service;

import bhyt.model.Config;

import java.util.Optional;

public interface ConfigService {
    Config updateConfig(Config config);
    Config findConfig(Long id);
}
