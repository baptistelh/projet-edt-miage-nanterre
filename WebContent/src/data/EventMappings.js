/**
 * @class Ext.calendar.data.EventMappings
 * @extends Object
 * A simple object that provides the field definitions for Event records so that they can be easily overridden.
 */
Ext.ns('Ext.calendar.data');

Ext.calendar.data.EventMappings = {
    EventId: {
        name: 'EventId',
        mapping: 'id',
        type: 'int'
    },
    CalendarId: {
        name: 'CalendarId',
        mapping: 'cid',
        type: 'int'
    },
    Title: {
        name: 'Title',
        mapping: 'ec',
        type: 'string'
    },
    StartDate: {
        name: 'StartDate',
        mapping: 'stat',
        type: 'date',
        dateFormat: 'Y-m-d H:i:s'
    },
    EndDate: {
        name: 'EndDate',
        mapping: 'end',
        type: 'date',
        dateFormat: 'Y-m-d H:i:s'
    },
    Time: {
        name: 'Time',
        mapping: 'time',
        type: 'string'
    },
    Location: {
        name: 'Location',
        mapping: 'room',
        type: 'string'
    },
    Teacher: {
    	name: 'Teacher',
    	mapping:'teacher',
    	type: 'string,'
    },
    Notes: {
        name: 'Notes',
        mapping: 'notes',
        type: 'string'
    },
    Url: {
        name: 'Url',
        mapping: 'url',
        type: 'string'
    },
    IsAllDay: {
        name: 'IsAllDay',
        mapping: 'ad',
        type: 'boolean'
    },
    Reminder: {
        name: 'Reminder',
        mapping: 'rem',
        type: 'string'
    },
    IsNew: {
        name: 'IsNew',
        mapping: 'n',
        type: 'boolean'
    }
};
