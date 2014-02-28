class UrlMappings {

	static mappings = {
		"/persons"(resources: 'person', include: ['show', 'index', 'save', 'update'])

		"/admin/console/$action?" (controller: 'console')

		"/"(view: "/index")
		"500"(view: '/error')
	}
}
