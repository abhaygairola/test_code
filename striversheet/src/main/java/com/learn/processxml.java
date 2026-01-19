package com.learn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class processxml {

public static final String STATUS = "status";
  public static final String PROCESS_ID = "processid";
  public static final String BATCH_SEQUENCE = "batchseq";
  public static final String REQUEST_ID = "requestid";
  public static final String RESPONSE_ID = "responseid";
  public static final String LOGS = "logs";
  public static final String LOG_ELEMENT = "log";
  public static final String TIMESTAMP = "timestamp";
  public static final String PROCESS_COUNT = "processcount";
  public static final String ERROR_COUNT = "errorcount";
  public static final String SKIP_COUNT = "skipcount";
  public static final String TABLE_NAME = "tablename";
  public static final String COLUMN_LIST = "columnlist";
  public static final String EXCEPTION = "exception";
  public static final String ERROR = "error";
  public static final String DATA = "data";
  public static final String SQL_STRING = "sqlstring";
  public static final String TRANSACTION_NUMBER= "transactionno";
  public static final String CODE = "code";
  public static final String MESSAGE = "msg";



    public synchronized void doProcessMessage() {
		System.out.println("nside Report Handler service..");
		XMLEventReader reader = null;

        FileInputStream fin;
        final InputStream inputStream;
        try {
            fin = new FileInputStream("C:\\trans_output.xml");
            inputStream = fin;
        
			// IntTransmissionReport transmissionReport;
			String status = "UNKNOWN";
			Long processId = 0L;
			Long batchSeq = 0L;
			Long requestId = 0L;
			Long responseId = 0L;
			 Long errorCount = 0L;

			try {
				final XMLInputFactory inputFactory = XMLInputFactory.newInstance();
				reader = inputFactory.createXMLEventReader(inputStream);

				while (reader.hasNext()) {
					XMLEvent event = reader.nextEvent();

					if (event.isStartElement()) {
						final StartElement startElement = event.asStartElement();
						String qPart = startElement.getName().getLocalPart();

						switch (qPart.toLowerCase()) {
						case STATUS:
							status = getNodeText(reader);
							break;
						case PROCESS_ID:
							processId = getNodeLongValue(reader);
							break;
						case BATCH_SEQUENCE:
							batchSeq = getNodeLongValue(reader);
							break;
						case REQUEST_ID:
							requestId = getNodeLongValue(reader);
							break;
						case RESPONSE_ID:
							responseId = getNodeLongValue(reader);
							break;
						case LOGS:

							// transmissionReport = createOrUpdateTransmissionReport(processId, status, 0L);

							while (reader.hasNext()) {
								event = reader.nextEvent();

								if (event.isStartElement()) {
									qPart = event.asStartElement().getName().getLocalPart();

									if (qPart.equalsIgnoreCase(LOG_ELEMENT)) {
                                        System.out.println("logggg");

                                        System.out.println(status+" "+processId+" "+batchSeq+" "+requestId+" "+responseId);
										// errorCount += processLogEntry(reader, transmissionReport,
										// 		AuthorizationUtil.getCurrentUserName(), batchSeq, requestId,
										// 		responseId);
									}
								}
							}

							break;
						default:
							break;
						}
					}
				}

			} catch (final Exception e) {
				// log.error("Unable to read XML file: " + e.getMessage());
                System.out.println("Unable to read XML file: " + e.getMessage());
				throw new Exception("Unable to read XML file: " + e.getMessage(), e);
			}
			
			// Set matching request id for response message
			// updateResponseMessage(message, requestId, processId);

			// Update the report with the total error count
			// createOrUpdateTransmissionReport(processId, status, errorCount);
		}



         catch (FileNotFoundException e) {
           e.printStackTrace();
        } 
         catch (final Exception e) {
			// log.debug("Error happened while processing inbound message: " + e.getMessage());
            System.out.println("Error happened while processing inbound message: " + e.getMessage());

			// ("Transmission Report processing inbound message exception", e);
		} finally {
			closeEventReaderQuietly(reader);
		}
	}


    	private void closeEventReaderQuietly(final XMLEventReader w) {
		try {
			if (w != null) {
				w.close();
			}
		} catch (final XMLStreamException e) {
			System.out.println("Error closing xml event reader"+ e);
		}
	}


    	private String getNodeText(final XMLEventReader reader) throws XMLStreamException {
		final StringBuilder sb = new StringBuilder(48);

		while (reader.hasNext()) {
			final XMLEvent event = reader.nextEvent();

			if (event.isEndElement()) {
				break;
			} else if (event.isCharacters()) {
				sb.append(event.asCharacters().getData());
			}
		}

		return sb.toString().trim();
	}

	private Long getNodeLongValue(final XMLEventReader reader) throws XMLStreamException {
		final String value = getNodeText(reader);
		return !isEmpty(value) ? Long.parseLong(value) : 0L;
	}


       public static final boolean isEmpty(String s) {
      return s == null || s.length() == 0;
   }
    
}
