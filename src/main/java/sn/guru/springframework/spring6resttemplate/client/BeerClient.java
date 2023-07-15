package sn.guru.springframework.spring6resttemplate.client;


import org.springframework.data.domain.Page;
import sn.guru.springframework.spring6resttemplate.model.BeerDTO;
import sn.guru.springframework.spring6resttemplate.model.BeerStyle;

import java.util.UUID;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface BeerClient {
    Page<BeerDTO> listBeers();

    Page<BeerDTO> listBeers(String beerName, BeerStyle beerStyle, Boolean showInventory, Integer pageNumber,
                            Integer pageSize);

    BeerDTO getBeerById(UUID beerId);

    BeerDTO createBeer(BeerDTO newDto);

    BeerDTO updateBeer(BeerDTO beerDto);

    void deleteBeer(UUID beerId);
}
