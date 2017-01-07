package km_Handler;

import km_Services.ExchangeCenterService;
import km_Services.ExchangeMarketService;
import km_Services.FileService;
import km_Services.KalenderService;
import km_Services.KarmaService;
import km_Services.KlassenService;
import km_Services.KnowledgeCenterService;
import km_Services.LoginService;
import km_Services.NotificationService;
import km_Services.PDFService;
import km_Services.SchuelerService;

public interface ServiceLocator {
	public ExchangeCenterService getExchangeCenterService();

	public ExchangeMarketService getExchangeMarketService();
	public FileService getFileService() ;
	public KalenderService getKalenderService() ;
	public KarmaService getKarmaService();
	public KlassenService getKlassenService() ;
	public KnowledgeCenterService getKnowledgeCenterService() ;
	public LoginService getLoginService() ;
	public NotificationService getNotificationService();
	public PDFService getPdfservice() ;
	public SchuelerService getSchuelerService();
}
