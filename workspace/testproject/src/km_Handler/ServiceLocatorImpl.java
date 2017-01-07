package km_Services;

public class ServiceLocator {

	private ExchangeCenterService exchangeCenterService;
	
	private ExchangeMarketService exchangeMarketService;
	
	private FileService fileService;
	
	private KalenderService kalenderService;
	
	private KarmaService karmaService;
	
	private KlassenService klassenService;
	
	private KnowledgeCenterService knowledgeCenterService;
	
	private LoginService loginService;
	
	private NotificationService notificationService;
	
	private PDFService pdfservice;
	
	private SchuelerService schuelerService;
	
	public ServiceLocator() {
	
		this.exchangeCenterService = new ExchangeCenterServiceImpl();
		this.exchangeMarketService= new ExchangeMarketServiceImpl();
		this.fileService = new FileServiceImpl();
		this.kalenderService = new KalenderServiceImpl();
		this.karmaService = new KarmaServiceImpl();
		this.klassenService = new KlassenServiceImpl();
		this.knowledgeCenterService = new KnowledgeCenterServiceImpl();
		this.loginService = new LoginServiceImpl();
		this.notificationService = new NotificationServiceImpl();
		this.pdfservice = new PDFServiceImpl();
		this.schuelerService = new SchuelerServiceImpl();
		
	}

	public ExchangeCenterService getExchangeCenterService() {
		return exchangeCenterService;
	}

	public void setExchangeCenterService(ExchangeCenterService exchangeCenterService) {
		this.exchangeCenterService = exchangeCenterService;
	}

	public ExchangeMarketService getExchangeMarketService() {
		return exchangeMarketService;
	}

	public void setExchangeMarketService(ExchangeMarketService exchangeMarketService) {
		this.exchangeMarketService = exchangeMarketService;
	}

	public FileService getFileService() {
		return fileService;
	}

	public void setFileService(FileService fileService) {
		this.fileService = fileService;
	}

	public KalenderService getKalenderService() {
		return kalenderService;
	}

	public void setKalenderService(KalenderService kalenderService) {
		this.kalenderService = kalenderService;
	}

	public KarmaService getKarmaService() {
		return karmaService;
	}

	public void setKarmaService(KarmaService karmaService) {
		this.karmaService = karmaService;
	}

	public KlassenService getKlassenService() {
		return klassenService;
	}

	public void setKlassenService(KlassenService klassenService) {
		this.klassenService = klassenService;
	}

	public KnowledgeCenterService getKnowledgeCenterService() {
		return knowledgeCenterService;
	}

	public void setKnowledgeCenterService(KnowledgeCenterService knowledgeCenterService) {
		this.knowledgeCenterService = knowledgeCenterService;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public NotificationService getNotificationService() {
		return notificationService;
	}

	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	public PDFService getPdfservice() {
		return pdfservice;
	}

	public void setPdfservice(PDFService pdfservice) {
		this.pdfservice = pdfservice;
	}

	public SchuelerService getSchuelerService() {
		return schuelerService;
	}

	public void setSchuelerService(SchuelerService schuelerService) {
		this.schuelerService = schuelerService;
	}
		
}
