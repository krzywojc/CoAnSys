package pl.edu.icm.coansys.disambiguation.author.pig.extractor;

import pl.edu.icm.coansys.models.DocumentProtos.TextWithLanguage;

import org.apache.pig.data.DataBag;
import org.apache.pig.data.DefaultDataBag;
import org.apache.pig.data.Tuple;
import org.apache.pig.data.TupleFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.edu.icm.coansys.models.DocumentProtos.DocumentMetadata;

public class EX_TITLE extends DisambiguationExtractor {
	
    private static final Logger logger = LoggerFactory.getLogger( EX_TITLE.class );

	@Override
	public DataBag extract( Object o ) {
		DocumentMetadata dm = (DocumentMetadata) o;
		
		DataBag db = new DefaultDataBag();
		Tuple t = TupleFactory.getInstance().newTuple(dm.getBasicMetadata().
						getTitleList().get(0).getText());
		db.add( t );
		
		return db;
	}    
    
	@Override
	public DataBag extract( Object o, String lang ) {
		
		DocumentMetadata dm = (DocumentMetadata) o;
		DataBag db = new DefaultDataBag();
		
        for ( TextWithLanguage title : dm.getBasicMetadata().getTitleList() ) {
            if ( lang.equalsIgnoreCase( title.getLanguage()) ) {
        		Tuple t = TupleFactory.getInstance().newTuple( title.getText() );
        		db.add( t );
        		return db;
            }
        }
        
        //TODO: Is possible, that one document has more than one title in given language?
        
        logger.info("No title IN GIVEN LANG (" + lang + ") out of " 
        		+ dm.getBasicMetadata().getTitleCount() + " titles!");
        
        return null;
	}
}
