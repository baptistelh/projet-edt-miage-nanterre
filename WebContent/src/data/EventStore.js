Ext.define('Ext.calendar.data.EventStore', {    
	extend: 'Ext.data.Store',
    model: 'Ext.calendar.data.EventModel',
    autoLoad: true,
    remoteSort:true,
    proxy: {
      type: 'rest',
      url: 'rest/GetSchedule/creneau',
      noCache: false,
      
      reader: {
          type: 'json',
          root: 'evts'
      }
    },
});