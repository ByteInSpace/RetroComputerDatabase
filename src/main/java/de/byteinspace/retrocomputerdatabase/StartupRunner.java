package de.byteinspace.retrocomputerdatabase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;

import de.byteinspace.retrocomputerdatabase.entity.CPU;
import de.byteinspace.retrocomputerdatabase.entity.Company;
import de.byteinspace.retrocomputerdatabase.entity.Computer;
import de.byteinspace.retrocomputerdatabase.repository.CPURepository;
import de.byteinspace.retrocomputerdatabase.repository.CompanyRepository;
import de.byteinspace.retrocomputerdatabase.repository.ComputerRepository;

public class StartupRunner implements CommandLineRunner {

	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired CPURepository cpuRepository;
	@Autowired CompanyRepository  companyRepository;
	@Autowired ComputerRepository  computerRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		CPU cpuZ80 = new CPU("Zilog Z80");
		CPU cpuMotorola = new CPU("Motorola 68000");
		CPU cpuMos = new CPU("MOS 6520");
		cpuRepository.save(cpuZ80);
		cpuRepository.save(cpuMotorola);
		cpuRepository.save(cpuMos);
		
		Company comCommodore = new Company("Commodore");
		Company comAtari = new Company("Atari");
		Company comSpectrum = new Company("Sinclair");
		
		companyRepository.save(comCommodore);
		companyRepository.save(comAtari);
		companyRepository.save(comSpectrum);
		
		
		Computer computerC64 = new Computer(comCommodore, "C64");
		computerC64.setYear(1982);
		computerC64.setCpu(cpuMos);
		computerC64.setGraphicalModes("320x200, 160x100");
		computerC64.setPorts("Centronics, RS 232");
		computerC64.setPrice(299);
		computerC64.setRam(64);
		computerC64.setRom(32);
		computerC64.setSoundModes("SID");
		computerC64.setThumb("c64.png");
		
		computerRepository.save(computerC64);
		
		Computer computerZXSpectrum = new Computer(comSpectrum, "ZX Spectrum 48 K");
		computerZXSpectrum.setYear(1982);
		computerZXSpectrum.setCpu(cpuZ80);
		computerZXSpectrum.setGraphicalModes("200x100, 160x100");
		computerZXSpectrum.setPorts("Centronics, RS 232");
		computerZXSpectrum.setPrice(299);
		computerZXSpectrum.setRam(48);
		computerZXSpectrum.setRom(32);
		computerZXSpectrum.setSoundModes("Beeper");
		computerZXSpectrum.setThumb("ZXSpectrum48.png");
		
		computerRepository.save(computerZXSpectrum);
		
		
		Computer computer800XL = new Computer(comAtari, "800 XL");
		computer800XL.setYear(1982);
		computer800XL.setCpu(cpuMotorola);
		computer800XL.setGraphicalModes("320x200, 160x100");
		computer800XL.setPorts("Centronics, RS 232");
		computer800XL.setPrice(310);
		computer800XL.setRam(64);
		computer800XL.setRom(32);
		computer800XL.setSoundModes("Tone");
		computer800XL.setThumb("800XL.png");
		
		computerRepository.save(computer800XL);
		
		
		logger.info("Initial Retrocomputer stored");
		
		
	}
	
	@Scheduled(initialDelay = 1000, fixedRate = 10000)
    public void run() {
		logger.info("Number of computers " + computerRepository.count());
	}
	
}
