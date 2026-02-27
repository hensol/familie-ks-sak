package no.nav.familie.ks.sak.barnehagelister

import no.nav.familie.ks.sak.barnehagelister.domene.BarnehagelisteMottattRepository
import org.springframework.stereotype.Service

@Service
class BarnehageListeService(
    val barnehagelisteMottattRepository: BarnehagelisteMottattRepository,
) {
    fun hentUarkiverteBarnehagelisteUuider(): List<String> = barnehagelisteMottattRepository.findAllIds()
}
