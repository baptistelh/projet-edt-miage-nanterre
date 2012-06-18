Ext.define('Ext.calendar.data.EventStore', {    
	extend: 'Ext.data.Store',
    model: 'Ext.calendar.data.EventModel',
    autoLoad: true,
    remoteSort:true,
    proxy: {
      type: 'rest',
      url: 'rest/GetSchedule/toto',
      noCache: false,
      
      reader: {
          type: 'json',
          root: 'evts'
      }
    },

//	constructor: function(config){
//		this.onCreateRecords = Ext.Function.createInterceptor(this.onCreateRecords, this.interceptCreateRecords);
//	},
//	
//	interceptCreateRecords: function(records, operation, success) {
//            var i = 0,
//                rec,
//                len = records.length;
//            
//            for (; i < len; i++) {
//                records[i].data[Ext.calendar.data.EventMappings.StartDate.name] = new Date(records[i].data[Ext.calendar.data.EventMappings.StartDate.name]);
//            }
//	}
});