package com.example.store;

import java.util.Arrays;
import java.util.List;

import com.example.exception.InvalidTypeException;
import com.example.exception.NotExistingKeyException;
import com.example.exception.StoreFullException;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class StoreActivity extends Activity {
	
	private Store mStore;
	private TextView mUIKeyEdit, mUIValueEdit;
	private Spinner mUITypeSpinner;
	private Button mUIGetButton, mUISetButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_store);
		
		mStore = new Store();
		
		mUIKeyEdit = (TextView)findViewById(R.id.key);
		mUIValueEdit = (TextView)findViewById(R.id.value);
		mUITypeSpinner = (Spinner)findViewById(R.id.spinner);
		String[] aStrItem = {"String","Integer", "Color"};
		mUITypeSpinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, aStrItem));
//		mUITypeSpinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){
//			
//			public void onItemSelected(AdapterView<?> parent, View view,
//		            int position, long id){
//				
//		    }
//			
//		    public void onNothingSelected(AdapterView<?> parent) {
//		        // TODO Auto-generated method stub
//		    }
//		});
		mUIGetButton = (Button)findViewById(R.id.getvalue);
		mUIGetButton.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				onGetValue();
			}
			
		});
		mUISetButton = (Button)findViewById(R.id.setValue);
		mUISetButton.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				onSetValue();
			}
			
		});
	}
	
	private void onGetValue() {
		String lKey = mUIKeyEdit.getText().toString();
		int i = (int) mUITypeSpinner.getSelectedItemId();
		try {
			switch (i) { 
			case 1:
				mUIValueEdit.setText(Integer.toString(mStore.getInteger(lKey)));
				break;
			case 0:
				mUIValueEdit.setText("string"+mStore.getString(lKey));
				break;
			case 2:
				mUIValueEdit.setText("color"+mStore.GetColor(lKey).toString());
				break;
			case 3:
				mUIValueEdit.setText(Ints.join(";", mStore.getIntegerArray(lKey)));
				break;
			case 4:
				mUIValueEdit.setText(Joiner.on(";").join(mStore.getColorArray(lKey)));
				break;
			}
		} catch (NumberFormatException eNumberFormatException) {
				displayError("ncorrect value.");
		}catch (NotExistingKeyException exception){
			displayError("Key does not exist in store");
		} catch (InvalidTypeException exception){
			displayError("Incorrect type");
		}
	}
	
	private void onSetValue() {
		String lKey = mUIKeyEdit.getText().toString();
		String lValue = mUIValueEdit.getText().toString(); 
		int i = (int) mUITypeSpinner.getSelectedItemId();
		try {
			switch (i) { 
			case 1:
				mStore.setInteger(lKey, Integer.parseInt(lValue));
				break;
			case 0:
				mStore.setString(lKey, lValue);
				break;
			case 2:
				mStore.setColor(lKey, new Color(lValue));
				break;
			case 3:
				mStore.setIntegerArray(lKey,
						Ints.toArray(stringToList(
						new Function<String, Integer>() {
						public Integer apply(String pSubValue) {
						return Integer.parseInt(pSubValue);
						}
						}, lValue)));
				break;
			case 4:
				List<Color> lIdList = stringToList(
						new Function<String, Color>() {
						public Color apply(String pSubValue) {
						return new Color(pSubValue);
						}
						}, lValue);
						Color[] lIdArray = lIdList.toArray(
						new Color[lIdList.size()]);
						mStore.setColorArray(lKey, lIdArray);
				break;
			}
		} catch (NumberFormatException eNumberFormatException) {
				displayError("ncorrect value.");
			}catch (StoreFullException e) {
				// TODO: handle exception
				displayError("Store is full");
			}
		}
	
	private void displayError(String pError) {
			Toast.makeText(getApplicationContext(), pError,
					Toast.LENGTH_LONG).show();
		}
	
	private <TType> List<TType> stringToList(Function<String, TType> pConversion, String pValue) {
		String[] lSplitArray = pValue.split(";");
		List<String> lSplitList = Arrays.asList(lSplitArray);
		return Lists.transform(lSplitList, pConversion);
	}
	
}
