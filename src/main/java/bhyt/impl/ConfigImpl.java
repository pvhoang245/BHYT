package bhyt.impl;

import bhyt.model.Config;
import bhyt.repository.ConfigRepository;
import bhyt.service.ConfigService;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ConfigImpl implements ConfigService {
    private ConfigRepository configRepository;

    public ConfigImpl(ConfigRepository configRepository) {
        super();
        this.configRepository = configRepository;
    }

    @Override
    public Config updateConfig(Config config) {
        return configRepository.save(config);
    }

    @Override
    public Config findConfig(Long id) {
        return configRepository.findById(id).get();
    }
}
