package ui

import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

@Suppress("UnstableApiUsage")
class SorterCode : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        val noti = NotificationGroup("codeStyle", NotificationDisplayType.BALLOON, isLogByDefault = true)
        noti.createNotification(
            "mola",
            "mola mas",
            NotificationType.INFORMATION,
            null
        ).notify(e.project)
    }
}